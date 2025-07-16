class Data {
    int dia, mes, ano;

    void ajustarData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
