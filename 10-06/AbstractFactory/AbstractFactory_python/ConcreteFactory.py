from AbstractFactory import Pizzeria
from pizzaTutsy import PizzaTutsy
from papasTutsy import PapasTutsy
from pizzaCapri import PizzaCapri
from papasCapri import PapasCapri

class PizzeriaTutsy(Pizzeria):
    def pedir_pizza(self):
        return PizzaTutsy()

    def pedir_papas(self):
        return PapasTutsy()


class PizzeriaCapri(Pizzeria):
    def pedir_pizza(self):
        return PizzaCapri()

    def pedir_papas(self):
        return PapasCapri()