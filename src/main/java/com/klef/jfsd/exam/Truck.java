package com.klef.jfsd.exam;

import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private int payloadCapacity;

    public int getPayloadCapacity() { return payloadCapacity; }
    public void setPayloadCapacity(int payloadCapacity) { this.payloadCapacity = payloadCapacity; }
}
