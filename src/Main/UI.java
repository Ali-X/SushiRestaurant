package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Accounting.BirthDay;
import Accounting.Chain;
import Accounting.HolliDay;
import Accounting.SimpleDay;
import Accounting.TipsBirthDay;
import Accounting.TipsHolliDay;
import Accounting.TipsSimpleDay;
import Food.DoubleRoll;
import Food.DoubleSushi;
import Food.Fish;
import Food.Fresh;
import Food.Marinated;
import Food.Roll;
import Food.Sushi;
import Order.Bridge;
import Order.Delivery;
import Order.NewOrder;
import Order.Order;
import Worker.Administrator;

public class UI {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(
			System.in));
	Fish fish = null;
	Sushi sushi = null;
	Roll roll = null;
	Administrator admin = null;
	Order order = null;
	int typeoffish = 0;
	Chain c1 = new TipsBirthDay(); // chain of responsibility (14)
	Chain c2 = new TipsHolliDay();
	Chain c3 = new TipsSimpleDay();

	public void CreateAdmin() {
		// TODO Auto-generated method stub
		admin = Administrator.getInstance(); // singleton (1)

		/*
		 * Workers is coming 0 - AddAccountant 1 - CleaningWoman 2 - Cook 3 -
		 * Dishwasher 4 - Waiter 5 - Assistant Cook
		 */

		admin.commandBook.getCommand(0); // command (2)
		try {
			Thread.sleep(500);
			admin.commandBook.getCommand(1);
			Thread.sleep(600);
			admin.commandBook.getCommand(2);
			Thread.sleep(900);
			admin.commandBook.getCommand(3);
			Thread.sleep(700);
			admin.commandBook.getCommand(4);
			Thread.sleep(500);
			admin.commandBook.getCommand(5);
			Thread.sleep(500); // adapter(3)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void MakeOrder() {
		// TODO Auto-generated method stub
		order = new NewOrder();
		order.Register(admin.closet.waiter); // observer (9)
	}

	public void WhatKindFish() {
		// Choose type of fish
		System.out
				.println("Please enter the type of fish (1 - fresh; 2 - marinated):"); // abstract
																						// factory(4)
		try {
			typeoffish = Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (typeoffish == 1)
			fish = new Fresh(order);
		else {
			if (typeoffish == 2)
				fish = new Marinated(order);
			else
				System.out.println("Sorry, we dont have this type of fish.");
		}
	}

	public void WhatKindDish() {
		try {
			// TODO Auto-generated method stub
			// choose kind of dish
			int kindofdish = 0; // Template(8)
			System.out
					.println("Please enter the kind of dish (1 - simple; 2 - special):");
			kindofdish = Integer.parseInt(bf.readLine());
			if (kindofdish == 2) {
				int specialdish = 0;
				System.out
						.println("Please enter the type of special dish \n(1 - Two plates of sushi and sauce; \n2 - Two plates of roll and sauce; \n3 - Sushi, roll and two types of sauce):");
				specialdish = Integer.parseInt(bf.readLine());
				if (specialdish == 1) {

					int typeofsauce = 0; // decorator(6)
					String sauce = "";
					// choose type of sauce
					System.out
							.println("Please enter the type of sauce (1 - spicey; 2 - okonomiaki; 0 - no sauce):");
					typeofsauce = Integer.parseInt(bf.readLine());
					if (typeofsauce == 1)
						sauce = "spicey";
					if (typeofsauce == 2)
						sauce = "okonomiaki";
					if (typeoffish == 1) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of first plate of sushi (1 - futomaki; 2 - hosomaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							fish.CreateSushi("futomaki", order, sauce);
						if (typeofsushi == 2)
							fish.CreateSushi("hosomaki", order, sauce);
						System.out
								.println("Please enter the type of sseconf plate of ushi (1 - futomaki; 2 - hosomaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							fish.CreateSushi("futomaki", order, sauce);
						if (typeofsushi == 2)
							fish.CreateSushi("hosomaki", order, sauce);
					}
					if (typeoffish == 2) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of sushi (1 - uramaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							fish.CreateSushi("uramaki", order, sauce);
						System.out
								.println("Please enter the type of sushi (1 - uramaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							fish.CreateSushi("uramaki", order, sauce);
					}

				}
				if (specialdish == 2) {

					int typeofsauce = 0; // decorator(6)
					String sauce = "";
					// choose type of sauce
					System.out
							.println("Please enter the type of sauce (1 - soy; 2 - teriaki; 0 - no sauce):");
					typeofsauce = Integer.parseInt(bf.readLine());
					if (typeofsauce == 1)
						sauce = "soy";
					if (typeofsauce == 2)
						sauce = "teriaki";
					if (typeoffish == 1) {
						int typeofroll = 0;
						// choose type of roll
						System.out
								.println("Please enter the type of roll (1 - philadelphia):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							fish.CreateRoll("philadelphia", order, sauce);
						System.out
								.println("Please enter the type of roll (1 - philadelphia):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							fish.CreateRoll("philadelphia", order, sauce);
					}
					if (typeoffish == 2) {
						int typeofroll = 0;
						// choose type of roll
						System.out
								.println("Please enter the type of roll (1 - unagi; 2 - california):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							fish.CreateRoll("unagi", order, sauce);
						if (typeofroll == 2)
							fish.CreateRoll("california", order, sauce);
						System.out
								.println("Please enter the type of roll (1 - unagi; 2 - california):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							fish.CreateRoll("unagi", order, sauce);
						if (typeofroll == 2)
							fish.CreateRoll("california", order, sauce);
					}
				}
				if (specialdish == 3) {

					int typeofsauce = 0; // decorator(6)
					String sauce = "";
					// choose type of sauce
					System.out
							.println("Please enter the type of sauce (1 - spicey; 2 - okonomiaki; 0 - no sauce):");
					typeofsauce = Integer.parseInt(bf.readLine());
					if (typeofsauce == 1)
						sauce = "spicey";
					if (typeofsauce == 2)
						sauce = "okonomiaki";
					if (typeoffish == 1) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of sushi (1 - futomaki; 2 - hosomaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							sushi = fish.CreateSushi("futomaki", order, sauce);
						if (typeofsushi == 2)
							sushi = fish.CreateSushi("hosomaki", order, sauce);
					}
					if (typeoffish == 2) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of sushi (1 - uramaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							sushi = fish.CreateSushi("uramaki", order, sauce);
					}
					// choose type of sauce
					System.out
							.println("Please enter the type of sauce (1 - soy; 2 - teriaki; 0 - no sauce):");
					typeofsauce = Integer.parseInt(bf.readLine());
					if (typeofsauce == 1)
						sauce = "soy";
					if (typeofsauce == 2)
						sauce = "teriaki";
					if (typeoffish == 1) {
						int typeofroll = 0;
						// choose type of roll
						System.out
								.println("Please enter the type of roll (1 - philadelphia):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							roll = fish
									.CreateRoll("philadelphia", order, sauce);
					}
					if (typeoffish == 2) {
						int typeofroll = 0;
						// choose type of roll
						System.out
								.println("Please enter the type of roll (1 - unagi; 2 - california):");
						typeofroll = Integer.parseInt(bf.readLine());
						if (typeofroll == 1)
							roll = fish.CreateRoll("unagi", order, sauce);
						if (typeofroll == 2)
							roll = fish.CreateRoll("california", order, sauce);
					}
				}
			}
			if (kindofdish == 1) {
				// choose type of dish
				int typeofdish = 0;

				System.out
						.println("Please enter the type of dish (1 - sushi; 2 - roll):"); // factory(5)
				typeofdish = Integer.parseInt(bf.readLine());

				if (typeofdish == 1) {
					int typeofsauce = 0; // decorator(6)
					String sauce = "";
					// choose type of sauce
					System.out
							.println("Please enter the type of sauce (1 - spicey; 2 - okonomiaki; 0 - no sauce):");
					typeofsauce = Integer.parseInt(bf.readLine());
					if (typeofsauce == 1)
						sauce = "spicey";
					if (typeofsauce == 2)
						sauce = "okonomiaki";
					if (typeoffish == 1) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of sushi (1 - futomaki; 2 - hosomaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							sushi = fish.CreateSushi("futomaki", order, sauce);
						if (typeofsushi == 2)
							sushi = fish.CreateSushi("hosomaki", order, sauce);
					}
					if (typeoffish == 2) {
						int typeofsushi = 0;
						// choose type of sushi
						System.out
								.println("Please enter the type of sushi (1 - uramaki):");
						typeofsushi = Integer.parseInt(bf.readLine());
						if (typeofsushi == 1)
							sushi = fish.CreateSushi("uramaki", order, sauce);
					}
					// choose size of meal
					int sizeofmeal = 0; // Prototype(7)
					System.out
							.println("Please enter the size of dish (1 - single; 2 - double):");
					sizeofmeal = Integer.parseInt(bf.readLine());
					if (sizeofmeal == 2) {
						DoubleSushi dblsh = new DoubleSushi();
						dblsh.cook(sushi, order);
					}
				} else {
					if (typeofdish == 2) {
						int typeofsauce = 0; // decorator(6)
						String sauce = "";
						// choose type of sauce
						System.out
								.println("Please enter the type of sauce (1 - soy; 2 - teriaki; 0 - no sauce):");
						typeofsauce = Integer.parseInt(bf.readLine());
						if (typeofsauce == 1)
							sauce = "soy";
						if (typeofsauce == 2)
							sauce = "teriaki";
						if (typeoffish == 1) {
							int typeofroll = 0;
							// choose type of roll
							System.out
									.println("Please enter the type of roll (1 - philadelphia):");
							typeofroll = Integer.parseInt(bf.readLine());
							if (typeofroll == 1)
								roll = fish.CreateRoll("philadelphia", order,
										sauce);
						}
						if (typeoffish == 2) {
							int typeofroll = 0;
							// choose type of roll
							System.out
									.println("Please enter the type of roll (1 - unagi; 2 - california):");
							typeofroll = Integer.parseInt(bf.readLine());
							if (typeofroll == 1)
								roll = fish.CreateRoll("unagi", order, sauce);
							if (typeofroll == 2)
								roll = fish.CreateRoll("california", order,
										sauce);
						}
						// choose size of meal
						int sizeofmeal = 0; // Prototype(7)
						System.out
								.println("Please enter the size of dish (1 - single; 2 - double):");
						if (sizeofmeal == 2) {
							DoubleRoll dblr = new DoubleRoll();
							dblr.cook(roll, order);
						}
					} else
						System.out
								.println("Sorry, we dont have this type of dish.");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Delivery() {
		// TODO Auto-generated method stub
		try {
			int delivery = 0;
			// delivery
			System.out.println("Delivery to home? (1 - yes; 2 - no):"); // bridge(12)
			delivery = Integer.parseInt(bf.readLine());

			if (delivery == 1) {
				Bridge del = new Delivery(order);
				del.Additional();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Tips() {
		// TODO Auto-generated method stub
		c3.setNextChain(c2);
		c2.setNextChain(c1);
	}

	public void WhatDay() {
		// TODO Auto-generated method stub
		// birthday or holliday
		try {
			int day = 0;
			System.out
					.println("Choose the current day? (1 - simple day; 2 - birthday; 3 - holliday):"); // visitor(13)
			day = Integer.parseInt(bf.readLine());

			if (day == 2) {
				BirthDay bday = new BirthDay();
				order.setPrice(order.accept(bday));
				order.setOrder(bday.getName());
				order.setPrice(c3.calculate(order.getPrice(), bday));
				order.setOrder("Tips: "
						+ (int) c3.calculate(order.getPrice(), bday));
			} else {
				if (day == 3) {
					HolliDay bday = new HolliDay();
					order.setPrice(order.accept(bday));
					order.setOrder(bday.getName());
					order.setPrice(c3.calculate(order.getPrice(), bday));
					order.setOrder("Tips: "
							+ (int) c3.calculate(order.getPrice(), bday));
				} else {
					SimpleDay bday = new SimpleDay();
					order.setPrice(c3.calculate(order.getPrice(), bday));
					order.setOrder("Tips: "
							+ (int) c3.calculate(order.getPrice(), bday));
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void OrderInfo() {
		// TODO Auto-generated method stub
		// print the order
		System.out.println("Yout order: " + order.getOtder() + "\n");
		System.out.println("Yout price: " + order.getPrice() + "\n");
	}

	public void CheckEmployees() {
		// TODO Auto-generated method stub
		// states
		// if we have a cook
		try {
			if (admin.closet.cook != null || admin.closet.assistantcook != null) {
				order.curr = order.hewaitsorder; // state (11)
				if (admin.closet.cook != null)
					System.out.println(admin.closet.cook.getName()
							+ admin.closet.cook.cook.work());
				Thread.sleep(900);
				if (admin.closet.assistantcook != null)
					System.out.println(admin.closet.assistantcook.getName()
							+ admin.closet.assistantcook.cook.work());
				Thread.sleep(900);
			} else
				System.out
						.println("Sorry, we have some problems. Wait a while!");
			order.Notify();
			Thread.sleep(900);

			// the meal is cooked
			if (order.curr != null && admin.closet.waiter != null) {
				order.curr = order.heeat;
				System.out.println(admin.closet.waiter.getName()
						+ admin.closet.waiter.distribute.work());
				Thread.sleep(900);
			} else
				System.out
						.println("Sorry, we have some problems. Wait a while!");
			order.Notify();
			Thread.sleep(900);

			// give a bill
			if (order.curr != null
					&& (admin.closet.accountant != null || admin.closet.waiter != null)) {
				order.curr = order.hewaitsbill;
				if (admin.closet.accountant != null)
					System.out.println(admin.closet.accountant.getName()
							+ admin.closet.accountant.givebill.work());
				else {
					if (admin.closet.waiter != null)
						System.out.println(admin.closet.waiter.getName()
								+ admin.closet.waiter.givebill.work());
				}
				order.Notify();
				Thread.sleep(900);
			} else
				System.out
						.println("Sorry, we have some problems. Wait a while!");

			Thread.sleep(900);

			// take money
			if (admin.closet.accountant != null || admin.closet.waiter != null) {
				System.out.println(admin.closet.accountant.getName()
						+ admin.closet.accountant.takemoney.work());// Strategy(10)
			} else
				System.out
						.println("Sorry, we have some problems. Wait a while!");

			// wash dishes
			if (admin.closet.dishwasher != null || admin.closet.waiter != null
					|| admin.closet.cleaningwoman != null) {
				if (admin.closet.dishwasher != null)
					System.out.println(admin.closet.dishwasher.getName()
							+ admin.closet.dishwasher.wash.work());
				else {
					if (admin.closet.cleaningwoman != null)
						System.out.println(admin.closet.cleaningwoman.getName()
								+ admin.closet.cleaningwoman.wash.work());
					else if (admin.closet.waiter != null)
						System.out.println(admin.closet.waiter.getName()
								+ admin.closet.waiter.wash.work());
					Thread.sleep(900);
				}
			} else
				System.out.println("Dude, your dishes is dirty!");

			// clean restaurant
			if (admin.closet.dishwasher != null || admin.closet.waiter != null
					|| admin.closet.cleaningwoman != null) {
				if (admin.closet.cleaningwoman != null)
					System.out.println(admin.closet.cleaningwoman.getName()
							+ admin.closet.cleaningwoman.clean.work());
				else {
					if (admin.closet.dishwasher != null)
						System.out.println(admin.closet.dishwasher.getName()
								+ admin.closet.dishwasher.clean.work());
					else if (admin.closet.waiter != null)
						System.out.println(admin.closet.waiter.getName()
								+ admin.closet.waiter.clean.work());
					Thread.sleep(900);
				}
			} else
				System.out.println("Dude, your restaurant is dirty!");

		} catch (Exception e) {
			System.out.println("Dude, something is wrong!");
			System.out.println(e);
		}
	}

}
