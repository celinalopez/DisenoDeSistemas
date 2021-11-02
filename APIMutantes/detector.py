
def isMutant(muestraADN):
    matches = 0
    secuencias = 0  # Se forma una secuencia cada 4 matches

    for i in muestraADN:
        for j in range(len(i) - 1):
            if matches == 4:
                secuencias += 1
                matches = 0
            if i[j] == i[j + 1]:
                matches += 1
            elif matches < 4:
                matches = 0
    for i in range(len(muestraADN) - 1):
        for j in range(len(muestraADN[i]) - 1):
            if matches == 4:
                secuencias += 1
                matches = 0
            if muestraADN[j][i] == muestraADN[j + 1][i]:
                matches += 1
            elif matches < 4:
                matches = 0

    if secuencias > 1:
        return True
    else:
        return False
