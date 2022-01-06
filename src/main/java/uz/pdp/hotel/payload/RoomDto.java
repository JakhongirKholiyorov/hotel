package uz.pdp.hotel.payload;

import lombok.Data;

@Data
public class RoomDto {
    private Integer number;
    private Integer floor;
    private double size;
    private Integer hotelId;
}
