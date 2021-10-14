from abc import ABC, abstractmethod


class Pizzeria(ABC):
    @abstractmethod
    def pedir_pizza(self):
        pass

    @abstractmethod
    def pedir_papas(self):
        pass
