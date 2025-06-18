package PatonesDisenio.Factory_02;

public class FabricaWord extends FabricaDocumentos {

    @Override
    public Documento crearDocumento() {
        return new Word();
    }
}
