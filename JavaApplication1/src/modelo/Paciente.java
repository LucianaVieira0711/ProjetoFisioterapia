
package modelo;

/**
 *
 * @author Luciana Vieira
 */
public class Paciente {
    
    private int idpaciente;
    private String nome;
    private String rgpaciente;
    private String cpfpaciente;
    private String celpaciente;
    private String  enderecopaciente;
    private String ceppaciente;
    private String diagnosticopaciente;
    private String sexopaciente;
    private String emailpaciente;
    
    
    public Paciente(){
    
    }

    public Paciente(int idpaciente, String nome, String rgpaciente, String cpfpaciente, String celpaciente, String enderecopaciente, String ceppaciente, String diagnosticopaciente, String sexopaciente, String emailpaciente) {
        this.idpaciente = idpaciente;
        this.nome = nome;
        this.rgpaciente = rgpaciente;
        this.cpfpaciente = cpfpaciente;
        this.celpaciente = celpaciente;
        this.enderecopaciente = enderecopaciente;
        this.ceppaciente = ceppaciente;
        this.diagnosticopaciente = diagnosticopaciente;
        this.sexopaciente = sexopaciente;
        this.emailpaciente = emailpaciente;
    }

    /**
     * @return the idpaciente
     */
    public int getIdpaciente() {
        return idpaciente;
    }

    /**
     * @param idpaciente the idpaciente to set
     */
    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rgpaciente
     */
    public String getRgpaciente() {
        return rgpaciente;
    }

    /**
     * @param rgpaciente the rgpaciente to set
     */
    public void setRgpaciente(String rgpaciente) {
        this.rgpaciente = rgpaciente;
    }

    /**
     * @return the cpfpaciente
     */
    public String getCpfpaciente() {
        return cpfpaciente;
    }

    /**
     * @param cpfpaciente the cpfpaciente to set
     */
    public void setCpfpaciente(String cpfpaciente) {
        this.cpfpaciente = cpfpaciente;
    }

    /**
     * @return the celpaciente
     */
    public String getCelpaciente() {
        return celpaciente;
    }

    /**
     * @param celpaciente the celpaciente to set
     */
    public void setCelpaciente(String celpaciente) {
        this.celpaciente = celpaciente;
    }

    /**
     * @return the enderecopaciente
     */
    public String getEnderecopaciente() {
        return enderecopaciente;
    }

    /**
     * @param enderecopaciente the enderecopaciente to set
     */
    public void setEnderecopaciente(String enderecopaciente) {
        this.enderecopaciente = enderecopaciente;
    }

    /**
     * @return the ceppaciente
     */
    public String getCeppaciente() {
        return ceppaciente;
    }

    /**
     * @param ceppaciente the ceppaciente to set
     */
    public void setCeppaciente(String ceppaciente) {
        this.ceppaciente = ceppaciente;
    }

    /**
     * @return the diagnosticopaciente
     */
    public String getDiagnosticopaciente() {
        return diagnosticopaciente;
    }

    /**
     * @param diagnosticopaciente the diagnosticopaciente to set
     */
    public void setDiagnosticopaciente(String diagnosticopaciente) {
        this.diagnosticopaciente = diagnosticopaciente;
    }

    /**
     * @return the sexopaciente
     */
    public String getSexopaciente() {
        return sexopaciente;
    }

    /**
     * @param sexopaciente the sexopaciente to set
     */
    public void setSexopaciente(String sexopaciente) {
        this.sexopaciente = sexopaciente;
    }

    /**
     * @return the emailpaciente
     */
    public String getEmailpaciente() {
        return emailpaciente;
    }

    /**
     * @param emailpaciente the emailpaciente to set
     */
    public void setEmailpaciente(String emailpaciente) {
        this.emailpaciente = emailpaciente;
    }
    
     
    
    
}
