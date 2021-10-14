from personas import *
import personas

# ejecutivo - lider - gerente - director


class Banco():
    director = Director()
    gerente = Gerente()
    lider = LiderTeamEjecutivo()
    ejecutivo = EjecutivoCuenta()

    director.set_next(gerente).set_next(lider).set_next(ejecutivo)
    personas.main(director)
