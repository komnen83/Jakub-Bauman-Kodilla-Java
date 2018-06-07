package com.kodilla.good.patterns.challenges.CarRentalService;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
