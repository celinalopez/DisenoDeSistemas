from Factory import PizzaFactory

if __name__ == '__main__':

    for tipo_pizza in ('Muzzarella', 'Especial', 'Pepperonni', 'CuatroQuesos'):
        print('El precio de la pizza tipo {0} es de: ${1}'.format(tipo_pizza, PizzaFactory.pedir_pizza(tipo_pizza).get_precio()))

    # Prueba con una pizza
    print('----------------------------')
    fabrica = PizzaFactory()
    print('El precio de la pizza tipo {0} es de: ${1}'.format('Muzzarella', PizzaFactory.pedir_pizza('Muzzarella').get_precio()))
