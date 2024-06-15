package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-15T17:39:14", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Movimento.class)
public class Movimento_ { 

    public static volatile SingularAttribute<Movimento, Integer> idPessoa;
    public static volatile SingularAttribute<Movimento, String> tipo;
    public static volatile SingularAttribute<Movimento, Integer> idProduto;
    public static volatile SingularAttribute<Movimento, String> usuario;
    public static volatile SingularAttribute<Movimento, Integer> id;
    public static volatile SingularAttribute<Movimento, Integer> quantidade;
    public static volatile SingularAttribute<Movimento, Double> valorUnitario;

}