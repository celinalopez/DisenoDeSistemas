from domicilio import Domicilio


class Persona:

    # Este constructor cumple la funcion de constructor vacio y constructor que recibe parametros
    def __init__(self, nombre='', apellido='', edad=0):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad


    def __str__(self):
        return "Nombre:'{}', Apellido:'{}', Edad:'{}'".format(self.nombre, self.apellido, self.edad)

    @property
    def nombre(self):
        return self.__nombre

    @nombre.setter
    def nombre(self, value):
        self.__nombre = value

    @property
    def apellido(self):
        return self.__apellido

    @apellido.setter
    def apellido(self, value):
        self.__apellido = value

    @property
    def edad(self):
        return self.__edad

    @edad.setter
    def edad(self, value):
        self.__edad = value

    @staticmethod
    def usarDomicilio(domicilio, persona):
        domicilio.soyDomicilio(persona.nombre)

