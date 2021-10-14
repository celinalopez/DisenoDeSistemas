from abc import ABC, abstractmethod


class Handler(ABC):
    @abstractmethod
    def set_next(self, handler):
        pass

    @abstractmethod
    def handle(self, monto):
        pass


class AbstractHandler(Handler):
    _next_handler: Handler = None

    def set_next(self, handler):
        self._next_handler = handler
        return self._next_handler

    def handle(self, monto):
        if self._next_handler:
            return self._next_handler.handle(monto)
        return None
