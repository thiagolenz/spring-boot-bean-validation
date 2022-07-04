package canal.masterdev.exception;

import java.util.Map;

public class ErrorDTO {
    private Map<String, String> erros;

    public ErrorDTO(Map<String, String> erros) {
        this.erros = erros;
    }

    public Map<String, String> getErros() {
        return erros;
    }

    public void setErros(Map<String, String> erros) {
        this.erros = erros;
    }
}
