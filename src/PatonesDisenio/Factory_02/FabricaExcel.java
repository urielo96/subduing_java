package PatonesDisenio.Factory_02;

public class FabricaExcel extends FabricaDocumentos {
    @Override
    public Documento crearDocumento() {
        return new XLS();
    }
}
