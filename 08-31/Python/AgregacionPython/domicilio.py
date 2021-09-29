class Domicilio:

    # Este constructor cumple la funcion de constructor vacio y constructor que recibe parametros
    def __init__(self, calle='', numero=0):
        self.calle = calle
        self.numero = numero

    def __str__(self):
        return "Calle: '{}', Numero:'{}'".format(self.calle, self.numero)

    @property
    def calle(self):
        return self.__calle

    @calle.setter
    def calle(self, value):
        self.__calle = value

    @property
    def numero(self):
        return self.__numero

    @numero.setter
    def numero(self, value):
        self.__numero = value
