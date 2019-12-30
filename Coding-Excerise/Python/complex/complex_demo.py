import  complex.complex_pb2 as complex_pb2

complex_message = complex_pb2.ComplexMessage()

# WRONG WAY !!
#one_dummy_message =  complex_pb2.DummyMessage()
#one_dummy_message.id = 222
#one_dummy_message.name = "1 Dummy Message"

complex_message.one_dummy.id = 11
complex_message.one_dummy.name = "1 Dummy"

mDummy = complex_message.multiple_dummy.add()
mDummy.id   =   22
mDummy.name = "22 Dummy"

complex_message.multiple_dummy.add(id=44,name="44 Dummy")

print (complex_message)