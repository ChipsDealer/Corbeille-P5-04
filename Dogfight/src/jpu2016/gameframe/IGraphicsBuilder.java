package jpu2016.gameframe;

public interface IGraphicsBuilder {

	public void applyModelToGraphic(Graphics graphics, ImageObserver Observer);
	public int getGlobalWidth();
	public int getGlobalHeight();
}
