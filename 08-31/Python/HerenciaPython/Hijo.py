from Padre import Padre


class Hijo(Padre):
    def __init__(self):
        super().__init__()
        print("Se creo el hijo")
