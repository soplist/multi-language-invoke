#!python
# encoding: utf-8

def hello(name='world'):
    print("I'm %s. I'm %d year old" % ('wangkang', 30))
    print("I'm %(name)s. I'm %(age)d year old" % {'name':'wangkang', 'age':30})
    return 'hello %(name)s' % dict(name='world!')

if __name__ == '__main__':
    print(hello())
