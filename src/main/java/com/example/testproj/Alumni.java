package com.example.testproj;

import javax.persistence.*;

@Entity
@Table(name ="Alumni")
public class Alumni {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        @Column(name ="Name")
        private String Alum_Name;
        @Column(name ="Alum_School")
        private String Alum_School;
        @Column(name ="Alum_Major")
        private String Alum_Major;
        @Column(name ="Alum_Gradyear")
        private String Alum_Gradyear;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAlum_Name() {
            return Alum_Name;
        }

        public void setAlum_Name(String alum_Name) {
            Alum_Name = alum_Name;
        }

        public String getAlum_School() {
            return Alum_School;
        }

        public void setAlum_School(String alum_School) {
            Alum_School = alum_School;
        }

        public String getAlum_Major() {
            return Alum_Major;
        }

        public void setAlum_Major(String alum_Major) {
            Alum_Major = alum_Major;
        }

        public String getAlum_Gradyear() {
            return Alum_Gradyear;
        }

        public void setAlum_Gradyear(String alum_Gradyear) {
            Alum_Gradyear = alum_Gradyear;
        }
    }

