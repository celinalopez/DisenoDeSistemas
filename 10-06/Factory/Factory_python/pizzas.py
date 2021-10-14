from Pizza import Pizza


class Muzzarella(Pizza):
    def __init__(self):
        super().__init__()
        self._precio = 700


class Especial(Pizza):
    def __init__(self):
        super().__init__()
        self._precio = 800


class Pepperonni(Pizza):
    def __init__(self):
        super().__init__()
        self._precio = 900


class CuatroQuesos(Pizza):
    def __init__(self):
        super().__init__()
        self._precio = 850
