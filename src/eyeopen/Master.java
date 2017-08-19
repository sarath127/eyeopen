/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyeopen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author sarath kumar
 */
@Entity
@Table(name = "master", catalog = "nss", schema = "")
@NamedQueries({
    @NamedQuery(name = "Master.findAll", query = "SELECT m FROM Master m"),
    @NamedQuery(name = "Master.findById", query = "SELECT m FROM Master m WHERE m.id = :id"),
    @NamedQuery(name = "Master.findByName", query = "SELECT m FROM Master m WHERE m.name = :name"),
    @NamedQuery(name = "Master.findByDepartment", query = "SELECT m FROM Master m WHERE m.department = :department"),
    @NamedQuery(name = "Master.findBySec", query = "SELECT m FROM Master m WHERE m.sec = :sec"),
    @NamedQuery(name = "Master.findByYear", query = "SELECT m FROM Master m WHERE m.year = :year"),
    @NamedQuery(name = "Master.findByDateOfJoin", query = "SELECT m FROM Master m WHERE m.dateOfJoin = :dateOfJoin")})
public class Master implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "sec")
    private String sec;
    @Basic(optional = false)
    @Column(name = "year")
    private String year;
    @Basic(optional = false)
    @Column(name = "date_of_join")
    private String dateOfJoin;
    @Basic(optional = false)
    @Lob
    @Column(name = "image")
    private byte[] image;

    public Master() {
    }

    public Master(Integer id) {
        this.id = id;
    }

    public Master(Integer id, String name, String department, String sec, String year, String dateOfJoin, byte[] image) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.sec = sec;
        this.year = year;
        this.dateOfJoin = dateOfJoin;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        String oldSec = this.sec;
        this.sec = sec;
        changeSupport.firePropertyChange("sec", oldSec, sec);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        String oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        String oldDateOfJoin = this.dateOfJoin;
        this.dateOfJoin = dateOfJoin;
        changeSupport.firePropertyChange("dateOfJoin", oldDateOfJoin, dateOfJoin);
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        byte[] oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Master)) {
            return false;
        }
        Master other = (Master) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eyeopen.Master[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
