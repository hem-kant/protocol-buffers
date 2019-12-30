import  enums.enum_example_pb2 as enum_example_pb2

enum_message = enum_example_pb2.EnumMessage()
enum_message.id = 5

enum_message.day_of_the_week = enum_example_pb2.FRIDAY

print (enum_message)

print(enum_message.day_of_the_week)

with open("enum.bin" , "wb") as f:
    f.write(enum_message.SerializeToString())
    print ("Wrote to File")


with open("enum.bin" , "rb") as f:
    enum_message_read = enum_example_pb2.EnumMessage().FromString(f.read())
    print ("Reading from file")
    print (enum_message_read)