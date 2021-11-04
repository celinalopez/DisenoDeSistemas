from database import Database


class Oracle(Database):

    def __init__(self, name="myOracleDB", user="root", port="3000"):
        super().__init__(name, user, port)

    def connect(self):
        print("Conectando a Oracle...")

    def disconnect(self):
        print("Desconectando Oracle...")