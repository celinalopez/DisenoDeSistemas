from ISueldo import ISueldo


class Empleado(ISueldo):
    def __init__(self, nombre_completo, cargo, sueldo):
        self.nombre_completo = nombre_completo
        self.cargo = cargo
        self.sueldo = sueldo


    @property
    def nombreCompleto(self):
        return self.__nombre_completo

    @nombreCompleto.setter
    def nombreCompleto(self, value):
        self.__nombre_completo = value

    @property
    def cargo(self):
        return self.__cargo

    @cargo.setter
    def cargo(self, value):
        self.__cargo = value

    @property
    def sueldo(self):
        return self.__sueldo

    @sueldo.setter
    def sueldo(self, value):
        self.__sueldo = value

    def getSueldo(self):
        return self.__sueldo
