from oracle import Oracle
from mongodb import MongoDB
from mysql import MySQL

# en esta clase principal influye el patron inyeccion de dependencias

class Principal:
    def __init__(self, db):
        self.db = db


if __name__ == '__main__':
    db1 = Oracle("mioracle", "celina", 8000)
    app = Principal(db1)
    app.db.connect()
    app.db.disconnect()
    print(db1, "\n ------------------------------")

    db2 = MySQL("mysqlbase", "root", 3000)
    app2 = Principal(db2)
    app2.db.connect()
    app2.db.disconnect()
    print(db2, "\n ------------------------------")

    db3 = MongoDB("mimongobase", "root", 3030)
    app3 = Principal(db3)
    app3.db.connect()
    app3.db.disconnect()
    print(db3)
