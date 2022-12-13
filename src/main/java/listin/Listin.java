package listin;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Listin implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue
   private Long id;
   private String name;
   private String address;

   public Listin() { }
   public Listin(String n, String a) {
      this.name = n;
      this.address = a;
   }
   public Long getId() { return id; }
   public void setId(Long id) { this.id = id; }
   public String getName() { return name; }
   public  void setName(String n) { this.name = n;}
   public String getAddress() {return address;}
   public void setAddress(String a) {this.address = a; }
   @Override
   public String toString() {
      return String.format("(%s, %s)",
         this.name, this.address);
   }
}