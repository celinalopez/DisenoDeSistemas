from interface import *


class EjecutivoCuenta(AbstractHandler):
    def handle(self, monto):
        if monto <= 10000:

            return "Lo manejo yo, el ejecutivo de cuenta"
        else:
            return super().handle(monto)


class LiderTeamEjecutivo(AbstractHandler):
    def handle(self, monto):
        if 10000 < monto <= 50000:

            return "Lo manejo yo, el lider"
        else:
            return super().handle(monto)


class Gerente(AbstractHandler):
    def handle(self, monto):
        if 50000 < monto <= 100000:

            return "Lo manejo yo, el gerente"
        else:
            return super().handle(monto)


class Director(AbstractHandler):
    def handle(self, monto):
        if monto > 100000:
            return "Lo manejo yo, el director"
        else:
            return super().handle(monto)


def main(handler: Handler):
    monto = int(input("Monto a pedir prestado? "))
    who_approves = handler.handle(monto)
    if who_approves:
        print(f'{who_approves}')
    else:
        print("Error en el monto ingresado")
