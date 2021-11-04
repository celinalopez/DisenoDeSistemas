from database import Database


class MySQL(Database):
    def __init__(self, name="myMysqlDB", user="root", port="8000"):
        super(MySQL, self).__init__(name,user,port)

    def connect(self):
        print("Conectando a MySQL")

    def disconnect(self):
        print("Desconectando MySQL")
