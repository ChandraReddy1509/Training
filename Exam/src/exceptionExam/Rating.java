package exceptionExam;

public class Rating {
	int imbdRating;
	int nominee;

	public Rating(int imbdRating, int nominee) {
		this.imbdRating = imbdRating;
		this.nominee = nominee;
	}
}
class Validator {
	public String canBeConsideredForAward(Rating rating) throws Exception {
		if (rating.imbdRating < 7) {
			throw new MovieRatingException("Movie not Eligible for Filmfare award");

		} 
		else if (rating.nominee < 4) {
			throw new MovieRatingException("Minimum 4 nominee required");
		} else {
			return "Considered for the award";
		}
	}
	public String sendInvite(Rating rating) {
		try {
			canBeConsideredForAward(rating);	

		} catch (MovieRatingException e) {
			return "Not Invited";
		} catch (Exception e) {
			return "other exception";
		}
		return "Actors and Directors Invited";
	}
}


	class MovieRatingException extends Exception {
		public MovieRatingException(String msg) {
			super(msg);

		}
	}


	 class Source {

		public static void main(String args[]) throws Exception {
			Rating rating = new Rating(9, 7);
			Validator v = new Validator();
			String s = v.canBeConsideredForAward(rating);
			String t = v.sendInvite(rating);
			System.out.println(s.toLowerCase());
			System.out.println(t.toLowerCase());
		}

	}

