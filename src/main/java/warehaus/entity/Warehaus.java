package warehaus.entity;

import warehaus.entity.template.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Warehaus extends AbstractEntity {



}
