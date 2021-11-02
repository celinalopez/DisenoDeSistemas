import json, requests

dnaMutante = {
    "dna": ["ATGCGA", "CCGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"]
}
dnaMutante = json.dumps(dnaMutante)  # transformar el dict a json

urllocal = "http://localhost:3000/mutant"
r = requests.post(urllocal, data=dnaMutante)
print(r.json())
