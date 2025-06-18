package PatonesDisenio.Factory_02;

public class MainDocumentos {
    public static void main(String[] args) {


        // Solo estoy declarando la variable, no la inicializo
        FabricaDocumentos fabrica;

        // Voy a usar la fabrica para crear un documento Word
        fabrica = new FabricaWord();

        Documento word = fabrica.crearDocumento();

        word.crear();

        // Ahora creo un documento PDF
        fabrica = new FabricaPDF();
        Documento pdf = fabrica.crearDocumento();
        pdf.crear();

        // Ahora creo un documento XLS
        fabrica = new FabricaExcel();
        Documento xls = fabrica.crearDocumento();
        xls.crear();



    }
}
