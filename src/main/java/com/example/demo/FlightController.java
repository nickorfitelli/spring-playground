package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.Map;

//{
//        "departs": "2017-04-21 14:34",
//        "tickets": [
//        {
//        "passenger": {
//        "firstName": "Some name",
//        "lastName": "Some other name"
//        },
//        "price": 200
//        }
//        ]
//
//}

@RestController
public class FlightController {

    @GetMapping("/flights/flight")
    public Flight getFlight(){
        Flight flight = new Flight();
        flight.departs = LocalDate.now();
//        flight.tickets.passenger.firstName = "Some name";
//        flight.tickets.passenger.lastName = "Some other name";
//        flight.tickets.price = 200;

        return flight;
    }

    static class Flight {
         public LocalDate departs;
         public Tickets tickets;

        public LocalDate getDeparts() {
            return departs;
        }

        public void setDeparts(LocalDate departs) {
            this.departs = departs;
        }

        public com.example.demo.FlightController.Tickets getTickets() {
            return tickets;
        }

        public void setTickets(com.example.demo.FlightController.Tickets tickets) {
            this.tickets = tickets;
        }
    }

    static class Tickets{
       public Person passenger;
       public int price;

        public com.example.demo.FlightController.Person getPassenger() {
            return passenger;
        }

        public void setPassenger(com.example.demo.FlightController.Person passenger) {
            this.passenger = passenger;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    static class Person{
        public String firstName;
        public String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }



}
