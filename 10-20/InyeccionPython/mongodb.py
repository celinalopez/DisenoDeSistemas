from database import Database


class MongoDB(Database):
    def __init__(self, name="myMongoDB", user="root", port="3030"):
        super(MongoDB, self).__init__(name, user, port)

    def connect(self):
        print("Conectando a MongoDB")

    def disconnect(self):
        print("Desconectando MongoDB")
