import json
import detector
from flask import Flask, request, render_template

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("index.html")


@app.route('/', methods=['GET'])
@app.route('/mutant', methods=['GET'])
def home():
    return render_template('index.html'), 200


@app.route('/mutant', methods=['POST'])
def post():
    dna = request.data
    dna = json.loads(dna)
    dnalist = dna["dna"]

    if detector.isAdn(dnalist):
        if detector.isMutant(dnalist):
            msj = "ES MUTANTE!!!"
            return {"msj": msj}
        else:
            msj = "TODO OK, NO ES MUTANTE"
            return {"msj": msj}
    else:
        msj = "ERROR con la cadena de ADN, debe ser NxN y contener sólo elementos ACTG"
        return {"msj": msj}


if __name__ == '__main__':
    app.run(debug=True, port=3000)
