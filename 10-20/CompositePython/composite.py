from ISueldo import ISueldo


class Composite(ISueldo):

    def __init__(self):
        self.empleado = []

    def getSueldo(self):
        sumador = 0
        for i in range(len(self.empleado)):
            sumador = sumador + self.empleado[i].getSueldo()
        return sumador

    def agregar(self, p: ISueldo):
        self.empleado.append(p)
