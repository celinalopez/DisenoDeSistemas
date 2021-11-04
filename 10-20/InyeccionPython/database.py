from abc import ABC, abstractmethod


class Database(ABC):
    @abstractmethod
    def __init__(self, name, user, port):
        self.name = name
        self.user = user
        self.port = port

    def __str__(self):
        return "*database name: {} \n *user: {} \n *port: {}".format(self.name, self.user, self.port)

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self.__name = value

    @property
    def user(self):
        return self.__user

    @user.setter
    def user(self, value):
        self.__user = value

    @property
    def port(self):
        return self.__port

    @port.setter
    def port(self, value):
        self.__port = value

    @abstractmethod
    def connect(self):
        pass

    @abstractmethod
    def disconnect(self):
        pass
