
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


def isAdn(dna):
    N = len(dna)
    for filas in range(N):
        M = 0
        print()
        for col in range(len(dna[filas])):
            M += 1
            print(dna[filas][col], end="")
        if N == M:
            pass
        else:
            return False

    for f in range(len(dna)):
        print()
        fail = []
        error = 0
        for c in range(len(dna)):

            if (dna[f][c] == 'A' or dna[f][c] == 'T' or dna[f][c] == 'C' or
                    dna[f][c] == 'G'):
                pass
            else:
                print(" ", end="")
                error = 1
                fail.append(dna[f][c])
        if error:
            return False
    print()
    return True
