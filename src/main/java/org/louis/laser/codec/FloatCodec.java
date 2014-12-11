package org.louis.laser.codec;

import org.louis.laser.Laser;
import org.louis.laser.io.InputStream;
import org.louis.laser.io.OutputStream;

public class FloatCodec implements Codec<Float> {

	@Override
	public void encode(Laser laser, OutputStream out, Float value) throws Exception {
		out.writeFloat(value);
	}

	@Override
	public Float decode(Laser laser, InputStream in, Class<Float> type) throws Exception {
		return in.readFloat();
	}
}
