package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Laptop;

@RestController
@RequestMapping("laptop")
public class LaptopController
{
	Laptop lp;
	@PostMapping
	public String createLaptop(@RequestBody Laptop lap)
	{
		this.lp=lap;
		return "Laptop is created";
	}
	@GetMapping("{srNo}")
	public Laptop fetchLaptop(@PathVariable String srNo)
	{
		return lp; 
	}
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lap)
	{
		this.lp=lap;
		return "Update the data";
	}
	@DeleteMapping("{srNo}")
	public String deleteLaptop(@PathVariable String srNo)
	{
		lp=null;
		return" Delet Laptop";
		
		
	}
}
