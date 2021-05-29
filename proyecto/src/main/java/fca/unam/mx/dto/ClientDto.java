package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String apellido_m;
    private String apellido_p;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_materno")
    public String getapellido_m() {
        return apellido_m;
    }

    public void setapellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

  @ColumnName("apellido_paterno")
    public String getapellido_p() {
        return apellido_p;
    }

    public void setapellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

      @ColumnName("rfc")
    public String getrfc() {
        return rfc;
    }

    public void setrfc(String rfc) {
        this.rfc = rfc;
    }

}
