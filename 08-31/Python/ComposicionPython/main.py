from persona import Persona
from domicilio import Domicilio

if __name__ == '__main__':
    p1 = Persona("Juanita", "Perez", 23)
    print("Persona1{", p1, "}")
    d1 = Domicilio("Ponce", 232)
    p1.usarDomicilio(d1, p1)

    p2 = Persona("Marta", "Lopez", 54)
    print("Persona2{", p2, "}")
    d2 = Domicilio("Aristides", 43)
    p1.usarDomicilio(d2, p2)
