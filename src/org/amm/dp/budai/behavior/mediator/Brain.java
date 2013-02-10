package org.amm.dp.budai.behavior.mediator;

// Mediator
public class Brain {

	private Ear Ear;
	private Eye Eye;
	private Face Face;
	private Hand Hand;
	private Leg Leg;
	
	public Brain() {
		CreateBodyParts();
	}

	private void CreateBodyParts() {
		Ear = new Ear(this);
		Eye = new Eye(this);
		Face = new Face(this);
		Hand = new Hand(this);
		Leg = new Leg(this);
	}


	public void SomethingHappenedToBodyPart(BodyPart bodyPart)
    {
        if (bodyPart instanceof Ear)
        {
            String heardSounds = ((Ear)bodyPart).GetSounds();

            if (heardSounds.Contains("stupid"))
            {
                // attacking offender
                Leg.StepForward();
                Hand.HitPersonNearYou();
                Leg.Kick();
            }
            else if (heardSounds.Contains("cool"))
            {
                Face.Smile();
            }
        }
        else if (bodyPart instanceof Eye)
        {
            // brain can analyze what you see and
            // can react appropriately using different body parts
        }
        else if (bodyPart instanceof Hand)
        {
            var hand = (Hand)bodyPart;

            bool hurtingFeeling = hand.DoesItHurt();
            if (hurtingFeeling)
            {
                Leg.StepBack();
            }

            bool itIsNice = hand.IsItNice();
            if (itIsNice)
            {
                Leg.StepForward();
                Hand.Embrace();
            }
        }
        else if (bodyPart instanceof Leg)
        {
            // leg can also feel something if you would like it to
        }
    }

	public Ear getEar() {
		return Ear;
	}

	public void setEar(Ear ear) {
		Ear = ear;
	}

	public Eye getEye() {
		return Eye;
	}

	public void setEye(Eye eye) {
		Eye = eye;
	}

	public Face getFace() {
		return Face;
	}

	public void setFace(Face face) {
		Face = face;
	}

	public Hand getHand() {
		return Hand;
	}

	public void setHand(Hand hand) {
		Hand = hand;
	}

	public Leg getLeg() {
		return Leg;
	}

	public void setLeg(Leg leg) {
		Leg = leg;
	}

}
