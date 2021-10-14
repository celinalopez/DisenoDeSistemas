from ConcreteFactory import PizzeriaTutsy, PizzeriaCapri


class Cliente:
    @staticmethod
    def pedido(pizzeria):
        pizza = pizzeria.pedir_pizza()
        papas = pizzeria.pedir_papas()

        print(pizza.estilo())
        print(papas.menu_papas())


if __name__ == '__main__':

    cliente = Cliente()

    print("Voy a pedir en Tutsy")
    cliente.pedido(PizzeriaTutsy())

    print("---------------------\nVoy a pedir en Capri")
    cliente.pedido(PizzeriaCapri())
