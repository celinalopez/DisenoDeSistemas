from abc import ABC, abstractmethod


class ISueldo(ABC):
    @abstractmethod
    def getSueldo(self):
        pass
