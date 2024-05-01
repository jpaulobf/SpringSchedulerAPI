package br.com.actsoft.customer;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Customer {

    public Customer() {
    }

    public Customer(Integer id, String name, String cpf, String email, String logradouro, String numero, String bairro, String complemento, String cidade, String uf, Integer ddd, Integer celular) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
        this.ddd = ddd;
        this.celular = celular;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ddd")
    private Integer ddd;

    @Column(name = "celular")
    private Integer celular;

    //******************************************************//
    //*******            GETTERS and SETTERS        ********//
    //******************************************************//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    //******************************************************//
    //*******        EQUALS, HASHCODE, TOSTRING     ********//
    //******************************************************//
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(cpf, customer.cpf) && Objects.equals(email, customer.email) && Objects.equals(logradouro, customer.logradouro) && Objects.equals(numero, customer.numero) && Objects.equals(bairro, customer.bairro) && Objects.equals(complemento, customer.complemento) && Objects.equals(cidade, customer.cidade) && Objects.equals(uf, customer.uf) && Objects.equals(ddd, customer.ddd) && Objects.equals(celular, customer.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, logradouro, numero, bairro, complemento, cidade, uf, ddd, celular);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ddd=" + ddd +
                ", celular=" + celular +
                '}';
    }
}
