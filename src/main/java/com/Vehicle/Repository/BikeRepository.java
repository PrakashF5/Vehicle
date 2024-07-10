package com.Vehicle.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Vehicle.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
	
@Query(value="Select * from bikes where brand like ?", nativeQuery=true)
	public List<Bike> get1(String a);

@Query(value="Select brand,price from bikes", nativeQuery = true)
public List<Object> get2();

@Query(value="Select * from bikes where price>? and price<?", nativeQuery = true)
public List<Bike> get3(int a, int b);

@Query(value="Select * from bikes where length(brand)>?", nativeQuery = true)
public List<Bike> get4(int a);

@Query(value="Select max(price) from bikes",nativeQuery = true)
public int get5();

@Query(value="Select min(price) from bikes", nativeQuery = true)
public int get6();

@Query(value="Select * from bikes where price=(select max(price) from bikes)", nativeQuery = true)
public List<Bike> get7();

@Query(value="Select * from bikes where price=(select min(price) from bikes)", nativeQuery = true)
public List<Bike> get8();

@Query(value="Select max(price) from bikes where price<(select max(price) from bikes)", nativeQuery = true)
public int get9();

@Query(value="select price from bikes order by price", nativeQuery = true)
public List<Object> get10();

@Query(value="Select * from bikes order by price", nativeQuery = true)
public List<Bike> get11();

@Query(value="Select price from bikes order by price desc", nativeQuery = true)
public List<Object> get12();

@Query(value="Select b from Bike b where b.price>:P")
public List<Bike> get13(@Param ("P") int P);

@Query(value="Select max(c.price) from Bike c")
public int get14();

@Query(value="Select min(b.price) from Bike b")
public int get15();

@Query(value="Select b from Bike b where b.price=(Select max(c.price) from Bike c)")
public List<Bike> get16();

@Query(value="Select * from bikes where brand like ?", nativeQuery=true)
public List<Bike> get17(String a);

}
