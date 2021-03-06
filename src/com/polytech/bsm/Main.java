package com.polytech.bsm;

import com.polytech.bsm.clock.Clock;
import com.polytech.bsm.observer.DefaultView;
import com.polytech.bsm.observer.ViewHoursMinutes;
import com.polytech.bsm.strategy.StrategyPc;

public class Main {

	public static void main(String[] args) {
		
		// Selecting strategy
		StrategyPc strat = new StrategyPc();
		// Creating clock with the strategy
		Clock clock = new Clock(strat);
		// Creating views
		DefaultView defView = new DefaultView();
		ViewHoursMinutes viewHoursMinutes = new ViewHoursMinutes();
		
		// Attaching observers to the subject
		clock.attachObserver(defView);
		clock.attachObserver(viewHoursMinutes);
		
		// Using thread to update views every seconds
		Thread thread = new Thread(clock);
		thread.start();
	}

}
