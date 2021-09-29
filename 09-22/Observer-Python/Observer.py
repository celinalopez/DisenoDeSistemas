import abc


class AlarmaLibro():

    def __init__(self):
        self._observers = set()
        self._subject_state = None

    def attach(self, observer):
        observer._subject = self
        self._observers.add(observer)

    def detach(self, observer):
        observer._subject = None
        self._observers.discard(observer)

    def _notify(self):
        for observer in self._observers:
            observer.update()

    @property
    def subject_state(self):
        return self._subject_state

    @subject_state.setter
    def subject_state(self, value):
        self._subject_state = value
        self._notify()


class ILibroMalEstado(metaclass=abc.ABCMeta):

    def __init__(self):
        self._subject = None
        self._observer_state = None

    @abc.abstractmethod
    def update(self):
        pass


class Libro():

    def __init__(self, titulo, estado):
        self.titulo = titulo
        self.estado = estado

    def getEstado(self):
        return self.estado

    def setEstado(self, value):
        self.estado = value

    def getTitulo(self):
        return self.titulo

    def setTitulo(self, value):
        self.titulo = value


class Biblioteca():

    def __init__(self):
        self.l = None

    def devuelveLibro(self, libro, alarma):
        estado_libro = libro.getEstado()
        if estado_libro == "MALO":
            alarma.subject_state = estado_libro


class Administracion(ILibroMalEstado):

    def update(self):
        print('Administracion:')
        print('Suspensión de socio hasta la reposición o reparación del daño causado...')


class Compras(ILibroMalEstado):

    def update(self):
        print('Compras:')
        print('Solicito nueva cotizacion o reposicion del libro...')


class Stock(ILibroMalEstado):

    def update(self):
        print('Stock:')
        print('Se da de baja al libro y se manda a reparación o reposición...')


def main():
    sujeto_concreto = AlarmaLibro()
    observer_compras = Compras()
    observer_administracion = Administracion()
    observer_stock = Stock()

    sujeto_concreto.attach(observer_compras)
    sujeto_concreto.attach(observer_administracion)
    sujeto_concreto.attach(observer_stock)

    new_libro = Libro('Caperucita', 'MALO')

    biblioteca = Biblioteca()

    biblioteca.devuelveLibro(new_libro, sujeto_concreto)


if __name__ == "__main__":
    main()
