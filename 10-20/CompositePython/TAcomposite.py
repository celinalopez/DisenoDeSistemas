from composite import Composite
from banco import Banco
from sectorAdministrativo import SectorAdministrativo
from sectorGerencia import SectorGerencia
from sectorContaduria import SectorContaduria
from sectorRRHH import SectorRRHH
from sectorCajas import SectorCajas
from empleado import Empleado

class TAcomposite(Composite):
    pass


if __name__ == '__main__':
    banco = Banco()

    administracion = SectorAdministrativo()
    gerencia = SectorGerencia()
    cajas = SectorCajas()
    contaduria = SectorContaduria()
    rrhh = SectorRRHH()

    banco.agregar(administracion)
    banco.agregar(gerencia)
    banco.agregar(contaduria)

    administracion.agregar(cajas)
    administracion.agregar(rrhh)

    empleado1 = Empleado("Nafer Salas", "Cajero", 300)
    empleado2 = Empleado("Diana Roa","Cajero", 300)
    cajas.agregar(empleado1)
    cajas.agregar(empleado2)

    gerente = Empleado("Alvaro Molina","Gerente", 500)
    gerencia.agregar(gerente)

    selector = Empleado("Pedro Cañas","RRHH", 350)
    rrhh.agregar(selector)

    contador = Empleado("Monica Ardila","Contador", 380)
    contaduria.agregar(contador)

    print(banco.getSueldo())
