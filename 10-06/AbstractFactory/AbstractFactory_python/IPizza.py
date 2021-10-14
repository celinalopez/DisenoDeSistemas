from abc import ABC, abstractmethod


class Pizza(ABC):
    @abstractmethod
    def estilo(self):
        pass
