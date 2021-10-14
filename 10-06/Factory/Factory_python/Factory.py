from pizzas import Muzzarella, Especial, Pepperonni, CuatroQuesos


class PizzaFactory():
    @staticmethod
    def pedir_pizza(tipo_pizza):
        if tipo_pizza == 'Muzzarella':
            return Muzzarella()
        elif tipo_pizza == 'Especial':
            return Especial()
        elif tipo_pizza == 'Pepperonni':
            return Pepperonni()
        elif tipo_pizza == 'CuatroQuesos':
            return CuatroQuesos()
